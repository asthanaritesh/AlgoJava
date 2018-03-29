Observer Pattern:
Observer Pattern is one of the behavioral design pattern. 
Observer design pattern is useful when you are interested in the state of an object 
and want to get notified whenever there is any change. 
In observer pattern, the object that watch on the state of another object are called Observer 
and the object that is being watched is called Subject.
MVC Pattern is based on observer pattern.

Example:
Here, We have a model (Subject) (think of Cube etc) containing one int value (think of length)
# views (2D, 3D and wireframe) registers for this model
and get notified each time model changes its value (length), and may redraw itself.