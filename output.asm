.data
rivinvaihto: .asciiz "\n"
.text
.globl main

main: 

li $t0, 5
sw $t0, 4($gp)
lw $t0, 4($gp)
sw $t0, 0($gp)

li $t0, 30
sw $t0, 8($gp)
#left
lw $s0, 0($gp)
#right
lw $s1, 8($gp)

LOOP0:
beq $s0, $s1, ENDLOOP0
li $t0, 1
sw $t0, 20($gp)
lw $t0, 0($gp)
lw $t1, 20($gp)
add $t0, $t0, $t1
sw $t0, 24($gp)
lw $t0, 24($gp)
sw $t0, 16($gp)
li $t0, 1
sw $t0, 28($gp)
lw $t0, 0($gp)
lw $t1, 28($gp)
add $t0, $t0, $t1
sw $t0, 32($gp)
lw $t0, 32($gp)
sw $t0, 0($gp)
li $v0, 1
lw $a0, 16($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
lw $s0, 0($gp)

j LOOP0

ENDLOOP0:

li $t0, 5
sw $t0, 12($gp)
lw $t0, 12($gp)
sw $t0, 8($gp)
li $v0, 1
lw $a0, 0($gp)
syscall

li $v0, 10
syscall
