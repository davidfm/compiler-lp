.data
salida:	.asciiz "El numero es el: "
.text
.globl main

main: 

li.s $f2, 5.723
swc1 $f2, 4($gp)
lwc1 $f0, 4($gp)
swc1 $f0, 0($gp)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 0($gp)
syscall

li $v0, 10
syscall
