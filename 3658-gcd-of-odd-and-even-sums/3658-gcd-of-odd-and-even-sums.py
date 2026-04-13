import math
class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        even_sum = 0
        count_one = 0;
        count_two = 0;
        odd_sum = 0
        i=2
        j=1
        while(count_one<n):
            even_sum = even_sum + i
            i += 2
            count_one+=1
        while(count_two<n):
            odd_sum = odd_sum + j
            j += 2
            count_two+=1

        a = math.gcd(even_sum,odd_sum)
        return a

        
