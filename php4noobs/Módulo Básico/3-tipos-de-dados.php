<?php
echo "Exemplos de números inteiros \n";
var_dump(1234); // número decimal
var_dump(-123); // um número negativo
var_dump(0123); // número octal (equivalente a 83 em decimal)
var_dump(0x1A); // número hexadecimal (equivalente a 26 em decimal)
var_dump(0b11111111); // número binário (equivalente ao 255 decimal)

echo "Exemplos de vetores (arrays)" . PHP_EOL;

$vetorzada = ["boa noitee",true,1.33,1,2,3,4,5,6,7,8];

var_dump($vetorzada);
//var_dump($vetorzada[0]);

$vetorAssociativoPessoa = [
    'name' => 'Matheus',
    'age' => 21,
    'city' => 'Rio de Janeiro',
    'state' => 'RJ'
];

var_dump($vetorAssociativoPessoa);
var_dump($vetorAssociativoPessoa['name']);