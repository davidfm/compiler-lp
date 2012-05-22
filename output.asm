.data
salida:	.asciiz "El numero es: "
.text
.globl main

main: 

li $t0, 10
sw $t0, 12($gp)
lw $t0, 12($gp)
sw $t0, 0($gp)
li $t0, 8
sw $t0, 16($gp)
lw $t0, 16($gp)
sw $t0, 4($gp)
lw $t0, 0($gp)
lw $t1, 4($gp)
mul $t0, $t0, $t1
sw $t0, 20($gp)
li $t0, 5
sw $t0, 24($gp)
li $t0, 2
sw $t0, 28($gp)
lw $t0, 24($gp)
lw $t1, 28($gp)
div $t0, $t0, $t1
sw $t0, 32($gp)
li $t0, 5
sw $t0, 36($gp)
li $t0, 2
sw $t0, 40($gp)
lw $t0, 36($gp)
lw $t1, 40($gp)
mul $t0, $t0, $t1
sw $t0, 44($gp)
lw $t0, 32($gp)
lw $t1, 44($gp)
sub $t0, $t0, $t1
sw $t0, 48($gp)
lw $t0, 20($gp)
lw $t1, 48($gp)
add $t0, $t0, $t1
sw $t0, 52($gp)
lw $t0, 52($gp)
sw $t0, 8($gp)
li $v0, 4
la $a0, salida
syscall
li $v0, 1
lw $a0, 8($gp)
syscall

li $v0, 10
syscall
