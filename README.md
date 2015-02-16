

Groovy-Patterns
===============

A collection of design patterns and idioms in Groovy based on [Python Patterns](https://github.com/faif/python-patterns "Python Patterns").

The purpose of this repo is not only to learn the design patterns but also see their implementation in python which will help revise some of python and implement them in groovy which is my primary language of development currently. I will be adding the files mentioned in the README as the time goes on and keep it upto date with latest patterns implemented in the mentioned python repo as well as whatever new patterns I come acrros.

For best reference on design patterns using Groovy please refer documentation - [Groovy design patterns] [http://groovy.codehaus.org/Design+Patterns+with+Groovy]

Current Patterns:

| Pattern | Description |
|:-------:| ----------- |
| [3-tier](3-tier.groovy) | data<->business logic<->presentation separation (strict relationships) |
| [abstract_factory](abstract_factory.groovy) | use a generic function with specific factories |
| [adapter](adapter.groovy) | adapt one interface to another using a whitelist |
| [borg](borg.groovy) | a singleton with shared-state among instances |
| [bridge](bridge.groovy) | a client-provider middleman to soften interface changes |
| [builder](builder.groovy) | call many little discrete methods rather than having a huge number of constructor parameters |
| [catalog](catalog.groovy) | general methods will call different specialized methods based on construction parameter |
| [chain](chain.groovy) | apply a chain of successive handlers to try and process the data |
| [command](command.groovy) | bundle a command and arguments to call later |
| [composite](composite.groovy) | encapsulate and provide access to a number of different objects |
| [decorator](decorator.groovy) | wrap functionality with other functionality in order to affect outputs |
| [facade](facade.groovy) | use one class as an API to a number of others |
| [factory_method](factory_method.groovy) | delegate a specialized function/method to create instances |
| [flyweight](flyweight.groovy) | transparently reuse existing instances of objects with similar/identical state |
| [graph_search](graph_search.groovy) | (graphing algorithms, not design patterns) |
| [mediator](mediator.groovy) | an object that knows how to connect other objects and act as a proxy |
| [memento](memento.groovy) | generate an opaque token that can be used to go back to a previous state |
| [mvc](mvc.groovy) | model<->view<->controller (non-strict relationships) |
| [observer](observer.groovy) | provide a callback for notification of events/changes to data |
| [pool](pool.groovy) | preinstantiate and maintain a group of instances of the same type |
| [prototype](prototype.groovy) | use a factory and clones of a prototype for new instances (if instantiation is expensive) |
| [proxy](proxy.groovy) | an object funnels operations to something else |
| [publish_subscribe](publish_subscribe.groovy) | a source syndicates events/data to 0+ registered listeners |
| [state](state.groovy) | logic is org'd into a discrete number of potential states and the next state that can be transitioned to |
| [strategy](strategy.groovy) | selectable operations over the same data |
| [template](template.groovy) | an object imposes a structure but takes pluggable components |
| [visitor](visitor.groovy) | invoke a callback for all items of a collection |
| [chaining_method](chaining_method.groovy) | continue callback next object method |
