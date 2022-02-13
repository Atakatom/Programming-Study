### PATIKA ALGORITHMS HOMEWORKS 

## Insertion Sort Homework

Original array -> [22,27,16,2,18,6] 

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

[2,27,16,22,18,6]
[2,6,16,22,18,27]
[2,6,16,18,22,27]


2. Big-O gösterimini yazınız. O(n²) 


3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.

Best case: Ω(n)	
Average case : θ(n^2)	
Worst case : O(n^2)

4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

18 - average case(since it is on the middle)

5. [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
##### Solution

[2,3,5,8,7,9,4,15,6]
[2,3,4,8,7,9,5,15,6]
[2,3,4,5,7,9,8,15,6]
[2,3,4,5,6,9,8,15,7]
...

## Merge Sort Homework

[16,21,11,8,12,22] -> Merge Sort

1. Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

[16,21,11] | [8,12,22]
[16,21] | [11] | [8,12] | [22]
[11,16,21] | [8,12,22]
[8,11,12,16,21,22]

2. Big-O gösterimini yazınız. -> O(n log(n))	

## Binary Search Tree Homework

[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

#### 

 1. 7
 2. 7, 5
 3. 5, 1, 7
 4. 5, 1, 7, -, -, -, 8
 5. 5, 1, 7, -, 3, -, 8
 6. 5, 1, 7, -, 3, 6, 8
 7. 5, 1, 7, 0, 3, 6, 8
 8. 5, 1, 7, 0, 3, 6, 8, -, -, -, -, -, -, -, 9
 9. 5, 1, 7, 0, 3, 6, 8, -, -, 2, -, -, -, -, 9
10. 5, 1, 7, 0, 3, 6, 8, -, -, 2, 4, -, -, -, 9

I wrote binary search tree as implemented to an array.


