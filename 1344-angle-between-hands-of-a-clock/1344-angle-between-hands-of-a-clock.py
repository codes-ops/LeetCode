class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        a = abs(30*hour-((minutes*11)/2))
        c = 360 - a
        return min(a,c)









