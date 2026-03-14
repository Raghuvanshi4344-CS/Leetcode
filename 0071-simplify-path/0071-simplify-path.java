// class Solution {
//     public String simplifyPath(String path) {
//         Stack<String> s=new Stack<>();
//         String []part=path.split("/");
//         for(int i=0;i<part.length;i++){
//             if(part[i].equals("") || part[i].equals(".")){
//                 continue;
//             }
//             if(part[i].equals("..")){
//                 if(!s.isEmpty()){
//                     s.pop();
//                 }
//             }
//             else{
//                 s.push(part[i]);
//             }
//         }
//         if(s.isEmpty()) return "/";
//         String y="";
//         for(int i=0;i<s.size();i++){
//             y=y+"/"+s.get(i);
//         }
//         return y;
//     }
// }







import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String dir = "";  // current directory name

        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);

            if (c == '/') {
                if (!dir.equals("")) {        // end of a directory
                    if (dir.equals("..")) {  // go up
                        if (!s.isEmpty()) s.pop();
                    } else if (!dir.equals(".")) { // ignore "."
                        s.push(dir);
                    }
                    dir = "";  // reset for next directory
                }
            } else {
                dir += c;  // build the directory name
            }
        }

        // Handle last directory if path doesn't end with '/'
        if (!dir.equals("")) {
            if (dir.equals("..")) {
                if (!s.isEmpty()) s.pop();
            } else if (!dir.equals(".")) {
                s.push(dir);
            }
        }

        // Build the final path
        if (s.isEmpty()) return "/";

        StringBuilder y = new StringBuilder();
        for (String d : s) {
            y.append("/").append(d);
        }

        return y.toString();
    }
}