# Adapter Pattern
## Definition:
The Adapter Pattern allows incompatible interfaces to work together by converting one interface into another. It acts as a bridge between two incompatible interfaces.

## Use case:
You have a class with a specific interface, but you need to integrate it with a system that expects a different interface.

## Example:
Imagine you have an old system that uses a OldPrinter class that prints via printOld. You want to integrate this old system into a new system that expects a Printer interface with a print method.