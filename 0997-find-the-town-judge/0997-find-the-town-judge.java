class Solution {
    public int findJudge(int n, int[][] trust) {

        for(int i = 1; i <= n; i++) {

            boolean judge = true;

            for(int j = 1; j <= n; j++) {

                if(i == j) {
                    continue;
                }

                boolean trusts = false;
                boolean trustedBy = false;

                for(int[] t : trust) {
                    if(t[0] == i && t[1] == j) {
                        trusts = true;
                    }
                    if(t[0] == j && t[1] == i) {
                        trustedBy = true;
                    }
                }

                if(trusts || !trustedBy) {
                    judge = false;
                    break;
                }
            }

            if(judge) {
                return i;
            }
        }

        return -1;
    }
}