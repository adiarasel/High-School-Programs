Aditikrishna Mandula
Period 6

Code Name: Doubled-Up

Welcome to Doubled-Up! If parentheses and brackets confuse you, this is not the language for you, because
there is even more confusion involved in this one! Everything is doubled up: colons, commands, operations;
the only things that haven't changed (for your ease, of course) are the booleans!

1. Commenting!
Similar to how Java and C++ have \\ to indicate a comment, Doubled-Up indicates comments with two colons like so:
:: This is a comment!
There are no facilities for in-line comments yet, so label everything on a solo line! Look below for more examples:
:: Example 1! This is a lovely comment that will be ignored by the compiler!
:: Example 2! 34567893456789 is also going to be ignored by the compiler!
:: Anything you put in this comment will be ignored!

2. Printing!
Printing in Java is a hassle; so is the printing in C++. Python printing is the best, but the word print is 5 whole
characters long! Who wants to type 5 characters when you can type 4 Doubled-Up (that's 8 haha)! We at Doubled-Up
took inspiration from the cout of C++ and (you guessed it) Doubled it Up! You can only print either one variable or
one string, as shown below. Be careful, though! If you are printing a string or number, make sure to put double
parentheses around it! And if you are printing a variable, do not use parentheses at all!

coutcout ((This is a print statement))
coutcout ((23456789876543))
coutcout ((We can print strings, integers, or variables))
::(assuming raisin is a previously defined variable)
coutcout raisin

3. Variables!
We briefly mentioned variables in our section about printing. Well, now you get to know more! We currently only
offer integers and strings as variables, and they are defined as follows:

intint raisin
strstr ocean

As you can see, they're pretty nice looking when Doubled-Up!

4. Operations!

Using the variables and integers we mentioned above, we can add, subtract, multiply, divide, and modulus!
Again, because our language is Doubled-Up, we've doubled it up! For example:

5 ++ 6
4 -- 3
4 ** 3
10 // 5
10 %% 2

There is no need to assign anything; it will output the result to your console!

5. Loops
The syntax for loops is simple enough! All you have to do is figure out how many times you want it to print, and
what command you want to do! Lucky for you, loop is doubled up too! Make sure you double bracket the command.

looploop(3) [[coutcout ((hello world))]]

6. Inputs!
You can also take in user inputs using the command inpinp! You can either take in an integer input or a string
input, and it will ask you for the name of the variable and the value you wish to assign! Be sure that you only
put double colons before the string you want to display as your input request!

intint inpinp ""How old are you?
strstr inpinp ""Do you like socializing?

7. Comparing strings and Integers
If you want to know how two different variables compare, well lucky for you, we have those functions available!
Simply write the command comcomstr or comcomint in order to determine which type of variables you want to compare,
and then use the && command to split up the variables you want to compare.

comcomint x && raisin
comcomstr ocean && newstr

8. Ifs!
Lastly, we come to ifs. We can use one of 6 boolean operators in the condition for an if: >=, <=, =, !=, >, <.
To write an if command, you need to take at least one variable and a command that you want to happen, and format
it like below. You must double bracket the command, but the condition must only be encased in single parentheses.
ifif(raisin >= x) [[coutcout ((noice))]]
ifif(raisin <= x) [[coutcout ((noice))]]
ifif(raisin != x) [[coutcout ((noice))]]
ifif(raisin > x) [[coutcout ((noice))]]
ifif(raisin < x) [[coutcout ((noice))]]
ifif(raisin = x) [[coutcout ((noice))]]

Thank you so much for trying out our code!