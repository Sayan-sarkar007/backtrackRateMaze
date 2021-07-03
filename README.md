BACK TRACK
Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time.
There are three types of problems in backtracking –
1.	Decision Problem – In this, we search for a feasible solution.

2.	Optimization Problem – In this, we search for the best solution.

3.	Enumeration Problem – In this, we find all feasible solutions.

Example 
RATE IN MAZE 

Suppose a rat have to reach the destination from the source via a path. Now the dark boxes are the block ones. Means rat can not go there. And it has to reach the destination by following the white paths.
		      So this is the question now we have to solve it using back track. A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination. The rat can move only in two directions: forward and down. In the maze matrix, 0 means the block is a dead end and 1 means the block can be used in the path from source to destination. Note that this is a simple version of the typical Maze problem.
And this will be the following representation of the diagram –
			{1, 0, 0, 0}
			{1, 1, 0, 1}
			{0, 1, 0, 0}
			{1, 1, 1, 1}
And the output should give us like –
			{1, 0, 0, 0}
			{1, 1, 0, 0}
			{0, 1, 0, 0}
			{0, 1, 1, 1}
The path is clearly visible. So the path will be this – 
Sol.
Approach: 
•	So we will use recursive function here.
•	Wo will make some Boolean functions and we will call the functions later in our main code. So this will make the code more clear and understable.
•	So the function will check the path. And it will decide that the rat reaches the destination or not.
•	If the path does not exist on the both side then it will backtrack and try other paths.
ALGORITHM
1.	Creating a function which will determine weather the path is safe or not.
2.	If it is safe mark it as maze[ i ][ j ] = 1. Where i is row and j is column.
3.	Then create a solution matrix that will store the final result. And that will initially filled with 0.
4.	Creating a recursive matrix that will take the input and can call the maze solver function.
5.	Check if the position is out of the matrix. If it is then return not valid.
6.	Then call the safe mark function and mark the position output [ i ][ j ] = 1.and check if the current position is the destination or not. If it reach the destination then print the matrix.
7.	For incrementing the position recursively call and set the position as ( i + 1 , j) [ for row increment ] and ( i + j +1 ) [ for column increment ].
8.	If it cannot go any path further then set the [i][j] as 0 for reaching the initial position it came from. ( main back tracking )
9.	Then unmark and position and move forward. 
10.	 And print the output
