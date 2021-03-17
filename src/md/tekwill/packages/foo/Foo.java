package md.tekwill.packages.foo;

import md.tekwill.packages.bar.Bar;
import md.tekwill.packages.bar.example.Example;
//import statement dont import the full package tree

public class Foo {
//import md.tekwill.packages.bar.Bar; < ---- DONT DO THAT, NOT THE PLACE FOR AN IMPORT
//import md.tekwill.packages.bar.example.Example;

    Bar bar;
    Example example;
}

//import md.tekwill.packages.bar.Bar; < ---- DONT DO THAT, NOT THE PLACE FOR AN IMPORT
//import md.tekwill.packages.bar.example.Example;