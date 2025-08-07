class ArrayWrapper {
    constructor(nums) {
        this.nums = nums;
    }

    // Override valueOf to enable arithmetic operations like +
    valueOf() {
        return this.nums.reduce((sum, num) => sum + num, 0);
    }

    // Override toString to customize string representation
    toString() {
        return `[${this.nums.join(',')}]`;
    }
}
