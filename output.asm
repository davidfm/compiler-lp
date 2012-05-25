.data
rivinvaihto: .asciiz "\n"
a: .space 32
.text
.globl main

main: 

la $s0, a
li $t0, 'H'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)

li $v0, 10
syscall
