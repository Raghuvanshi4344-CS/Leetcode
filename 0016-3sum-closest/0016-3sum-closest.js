/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function(nums, target) {
    let cs=nums[0]+nums[1]+nums[2];
    nums.sort((a,b)=>a-b);
    for(let i=0;i<nums.length;i++){
        let l=i+1;
        let r=nums.length-1;
        while(l<r){
            let sum=nums[i]+nums[l]+nums[r];
            if(Math.abs(cs-target)>Math.abs(sum-target)){ 
                cs=sum;
            }
            if(sum<target)l++;
            else if(sum>target) r--;
            else return sum;
        }
    }
    return cs;
};