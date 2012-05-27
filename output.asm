.data
rivinvaihto: .asciiz "\n"
.text
.globl main

main: 

li $t0, 0
sw $t0, 4($gp)
lw $t0, 4($gp)
sw $t0, 0($gp)

#left
lw $s0, 0($gp)
li $t0, 10
sw $t0, 8($gp)
#right
lw $s1, 8($gp)

LOOP0:
bgt $s0, $s1, ENDLOOP0
li $v0, 1
lw $a0, 0($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
li $t0, 1
sw $t0, 16($gp)
lw $t0, 0($gp)
lw $t1, 16($gp)
add $t0, $t0, $t1
sw $t0, 20($gp)
lw $t0, 20($gp)
sw $t0, 0($gp)
lw $s0, 0($gp)

j LOOP0

ENDLOOP0:


li $v0, 10
syscall
