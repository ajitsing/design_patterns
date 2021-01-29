## Observer Design Pattern

### What?

Observer design pattern is software design pattern in which an `Observable/Subject` maintains a list of
 `Observers/Subscribers` and notifies them whenever its state changes.


### When?

The Observer design pattern can be used in the cases where multiple objects wants
 to observe an object so that they can change themselves when its state changes.
 
### Example

Lets take an example of a website which supports multiple themes e.g Dark or Bright. There 
are many components on the web page like Header, Footer, Nav bar and body of the page.

User has an option on the web page to toggle the theme and based on the selected theme
all the components of the page should change themselves.

Now with this we have a relation between Theme and Page Components. All the Page Components 
wants to observe the Theme and change whenever its state changes. 