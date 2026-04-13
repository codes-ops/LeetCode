import math
class Solution:
    def findGCD(self, nums: List[int]) -> int:
        max = 0
        for i in nums:
            if i > max:
                max = i
        min = max
        for i in nums:
            if i < min:
                min = i
        
        a = math.gcd(max,min)
        return a
        