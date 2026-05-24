package org.example;

public enum Symbol {
    ace(1, "A"),
    two(2, "2"),
    three(3, "3"),
    four(4, "4"),
    five(5, "5"),
    six(6, "6"),
    seven(7, "7"),
    eight(8, "8"),
    nine(9, "9"),
    ten(10, "10"),
    jack(11, "J"),
    queen(12, "Q"),
    king(13, "K");

final int value;
final String letterValue
Symbol(int value, String letterValue){
    this.value = value;
    this.letterValue = letterValue
}
}


