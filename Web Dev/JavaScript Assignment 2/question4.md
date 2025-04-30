1. Handling arguments in js

If there are less arguments than parameters then parameters without a corresponding argument is set to `undefined` and if there are ore arguments than parameters then the extra values are simply ignored, but if we explicitly try to take themvia the rest operator they are sent into that array.

2. The purpose of rest op.

Its purpose it to allow any number of arguments to be passes into an array.
The rules are:
-> Must be at the last in the parameter list.
-> The identifier is `...`
eg: `...rest`
In the function rest is an array of the leftover parameter.
