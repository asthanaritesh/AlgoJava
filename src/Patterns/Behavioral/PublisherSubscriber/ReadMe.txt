It is same as observer pattern except:
In the Observer pattern, the Observers are aware of the Subject, also the Subject maintains a record of the Observers. 
Whereas, in Publisher/Subscriber, publishers and subscribers don’t need to know each other. 
They simply communicate with the help of message queues or broker.
In Publisher/Subscriber pattern, components are loosely coupled as opposed to Observer pattern.
Observer pattern is mostly implemented in a synchronous way, i.e. the Subject calls the appropriate method of all its observers 
when some event occurs. The Publisher/Subscriber pattern is mostly implemented in an asynchronous way (using message queue).
Observer pattern needs to be implemented in a single application address space. 
On the other hand, the Publisher/Subscriber pattern is more of a cross-application pattern.