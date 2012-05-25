.data
rivinvaihto: .asciiz "\n"
salida: .space 32
.text
.globl main

main: 

la $s0, salida
li $t0, 'P'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'u'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
li.s $f2, 12.75
swc1 $f2, 12($gp)
lwc1 $f0, 12($gp)
swc1 $f0, 0($gp)
li.s $f2, 5.25
swc1 $f2, 16($gp)
lwc1 $f0, 16($gp)
swc1 $f0, 4($gp)
li $t0, 0
sw $t0, 20($gp)
lw $t0, 20($gp)
mtc1 $t0, $f0
cvt.s.w $f2, $f0
swc1 $f2, 8($gp)
la $s0, salida
li $t0, 'V'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'v'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 0($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 4($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 8($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '+'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
lwc1 $f2, 0($gp)
lwc1 $f4, 4($gp)
add.s $f2, $f2, $f4
swc1 $f2, 24($gp)
lwc1 $f0, 24($gp)
swc1 $f0, 8($gp)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 8($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '-'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
lwc1 $f2, 0($gp)
lwc1 $f4, 4($gp)
sub.s $f2, $f2, $f4
swc1 $f2, 28($gp)
lwc1 $f0, 28($gp)
swc1 $f0, 8($gp)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 8($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '*'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
lwc1 $f2, 0($gp)
lwc1 $f4, 4($gp)
mul.s $f2, $f2, $f4
swc1 $f2, 32($gp)
lwc1 $f0, 32($gp)
swc1 $f0, 8($gp)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 8($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '/'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
lwc1 $f2, 0($gp)
lwc1 $f4, 4($gp)
div.s $f2, $f2, $f4
swc1 $f2, 36($gp)
lwc1 $f0, 36($gp)
swc1 $f0, 8($gp)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 8($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
li $t0, 32
sw $t0, 40($gp)
lw $t0, 40($gp)
mtc1 $t0, $f0
cvt.s.w $f2, $f0
swc1 $f2, 0($gp)
la $s0, salida
li $t0, 'S'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'g'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'A'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '3'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '2'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ','
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'u'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'v'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ':'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 2
lwc1 $f12, 0($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'P'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'u'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'v'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'p'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'y'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'u'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'm'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 't'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'm'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 't'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'T'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'm'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'h'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 't'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'f'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 't'
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '*'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '-'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '5'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '/'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '2'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '.'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '5'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '+'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '4'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '8'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '/'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '1'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '2'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '*'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '2'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '+'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, '='
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 1
lw $a0, 44($gp)
syscall
li $v0, 4
la $a0, rivinvaihto
syscall
la $s0, salida
li $t0, 'F'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'p'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'u'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'b'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'a'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'l'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'y'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'r'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'c'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'n'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'd'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'e'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, ' '
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 't'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'i'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'p'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 'o'
sb $t0, ($s0)
addi $s0, $s0, 1
li $t0, 's'
sb $t0, ($s0)
addi $s0, $s0, 1
sb $zero, ($s0)
li $v0, 4
la $a0, salida
syscall
li $v0, 4
la $a0, rivinvaihto
syscall

li $v0, 10
syscall
