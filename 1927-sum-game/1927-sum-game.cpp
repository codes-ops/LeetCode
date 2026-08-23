class Solution {
public:
    bool sumGame(string num) {
        int countLeft = 0, countRight = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num[i] == '?' && i < num.size() / 2)
                countLeft++;
            else {
                if (num[i] == '?') {
                    countRight++;
                };
            }
        }
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < num.size() / 2; i++) {
            if (num[i] != '?')
                sumLeft += num[i] - '0';
        }
        for (int i = num.size() / 2; i < num.size(); i++) {
            if (num[i] != '?')
                sumRight += num[i] - '0';
        }
        double netQmark = countRight - countLeft;
        netQmark /= 2.0;
        netQmark *= 9;
        return sumLeft - sumRight - netQmark != 0;
    }
};