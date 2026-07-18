class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int, int>> q;
        int n = grid.size();
        int m = grid[0].size();
        int freshOranges = 0;
        int minutes = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) { 
                if(grid[i][j] == 2) {
                    q.push({i, j});
                } else if(grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if(freshOranges == 0) {
            return 0;
        }
        vector<pair<int, int>> dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!q.empty() && freshOranges > 0) {
            int size = q.size();
            minutes++; 
            for(int i = 0; i < size; i++) {
                auto [row, col] = q.front();
                q.pop();
                for(auto d : dirs) {
                    int newRow = row + d.first;
                    int newCol = col + d.second;
                    if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; 
                        freshOranges--;           
                        q.push({newRow, newCol}); 
                    }
                }
            }
        }
        if(freshOranges > 0) {
            return -1;
        }
        return minutes;
    }
};