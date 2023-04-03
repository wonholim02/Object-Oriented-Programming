orig x3000
	LEA R0, A
	LDR R1, R0, #0
	LEA R0, B
	LDR R2, R0, #0
	LEA R0, C
	LDR R3, R0, #0
	LD R4, LENGTH

	ADD R2, R2, R4 
	ADD R2, R2, #-1
	AND R0, R0, #0

	WHILE 
	LDR R0, R1, #0
	LDR R5, R2, #0
	NOT R5, R5
	ADD R5, R5, #1
	AND R6, R6, #0
	ADD R0, R0, R5
	
	BRn ELSE
	ADD R6, R6, #1

	ELSE 
	STR R6, R3, #0
	ADD R1, R1, #1
	ADD R2, R2, #-1
	ADD R3, R3, #1
	ADD R4, R4, #-1

	BRp WHILE 
	HALT
 
A 		.fill x3200		
B 		.fill x3300		
C 		.fill x3400		
LENGTH 	.fill 3	
.end
.orig x3200
	.fill -2
	.fill 2
	.fill 1
.end
.orig x3300			
	.fill 1
	.fill 0
	.fill 3
.end
.orig x3400
	.blkw 3	
.end
