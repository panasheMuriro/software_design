# Bridge Pattern
## Definition:
- The Bridge Pattern decouples abstraction from implementation so that both can vary independently. It is used when you want to avoid a permanent binding between an abstraction and its implementation.

## Use case:
- You have an abstraction and multiple possible implementations, and you want to change both independently.

## Example:
- You have a shape interface with draw() and two different implementations: Circle and Square. You want to be able to switch between different drawing techniques (like RedPen or BluePen) without changing the shapes.