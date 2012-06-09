.data
rivinvaihto: .asciiz "\n"
.text
.globl main

main: 

li $t0, 4
sw $t0, 4($gp)
li.s $f2, 5.5
swc1 $f2, 8($gp)
lw $t0, 4($gp)
mtc1 $t0, $f6
cvt.s.w $f2, $f6
lwc1 $f4, 8($gp)
add.s $f2, $f2, $f4
swc1 $f2, 12($gp)
lwc1 $f0, 12($gp)
round.w.s $f1, $f0
mfc1 $t0, $f1
sw $t0, 0($gp)
li $v0, 1
lw $a0, 0($gp)
syscall

li $v0, 10
syscall
