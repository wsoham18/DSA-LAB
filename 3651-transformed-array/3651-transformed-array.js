function constructTransformedArray(nums) {
    const n = nums.length;
    const result = new Array(n);

    for (let i = 0; i < n; i++) {
        if (nums[i] === 0) {
            result[i] = 0;
        } else {
            let move = (i + nums[i]) % n;
            if (move < 0) move += n; // Ensure positive index
            result[i] = nums[move];
        }
    }

    return result;
}
