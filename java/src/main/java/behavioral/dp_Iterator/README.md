# Iterator

```
@startuml

interface Aggregate<T> {
	+ iterator() : T
}
interface Iterator<T> {
	+ hasNext() : boolean
	+ next() : T
}
class AggregateImpl<T> {
	+ iterator() : Iterator
}
class IteratorImpl<T> {
	- aggregate : Aggregate

	+ hasNext() : boolean
	+ next() : T
}
class Element {
	+ name
}

Aggregate -> Iterator : create

Aggregate <|.. AggregateImpl
Iterator <|.. IteratorImpl

AggregateImpl <-o IteratorImpl : has
AggregateImpl "1" o--> "many" Element : contains
@enduml
```

### 관련 패턴
[Visitor](../../../../../docs/behavioral/Visitor.md)
[Composite](../../../../../docs/structural/Composite.md)
[Factory Method](../../../../../docs/creational/FactoryMethod.md)
