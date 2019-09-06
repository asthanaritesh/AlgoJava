Visitor Design Pattern
Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. 
With the help of visitor pattern, we can move the operational logic from the objects to another class.

Here, visitor object has the power to control the algorithm with respect to the host they are visiting.

For example, think of a Shopping cart where we can add different type of items. before Checking out, 
we apply a promo code, according to this promo code, the discount will be applied on each item. the algorithm for 
calculating discount on each item may vary based on the item.

In our implementation, there are 3 Hosts and 3 visitors, each can speak "English", "Hindi" and "Bengali". 
Now when a visitor visits the host, the mode of communication will be decided by the visitor based on the host.