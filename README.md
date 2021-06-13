Refactoring steps for Video Rental 

—— [toRefactor](https://gitlab.com/tw-he-dev-bootcamp/base-repos/video-rental/-/refs/switch?destination=tree&path=&ref=toRefactor)
- [ ] Extract variable like name , format code, basic comments cleanup. 
- [ ] Separate header and footer step as methods.
- [ ] Replace vector with and ArrayList.
- [ ] Extract Frequent Renter points. Duplicate the loop once.
- [ ] Extract Total Amount out of the loop. Duplicate loop once more.
—— [checkpoint-1-loop-broken](https://gitlab.com/tw-he-dev-bootcamp/base-repos/video-rental/-/tree/checkpoint-1-loop-broken)
- [ ] Move Method Refactoring. 
    - [ ] Move Amount method to Rental 
    - [ ] Move Amount method to Movie class which it depends on.
- [ ] Introduce Price as a class, with Price code parameter.
- [ ] Move amount which depends on the pricing to it.
- [ ] Eliminate PriceCode in Movie class. 
—— [checkpoint-2-extract-price](https://gitlab.com/tw-he-dev-bootcamp/base-repos/video-rental/-/tree/checkpoint-2-extract-price)
- [ ] Replace Switch Conditional with Polymorphism on Price class, by adding subclass based on movie type.
- [ ] Simplify and eliminate Conditionals in the calculation of frequent reenter points by moving it down to Price class.
- [ ] Refactor and Extract the Statement method into a class, with the goal of isolating it from Customer class.

—— [master](https://gitlab.com/tw-he-dev-bootcamp/base-repos/video-rental/-/tree/master)
- [ ] TODO: Implement new requirement of HTML Statement


# video-rental
This is the video store refactoring exercise, from Martin Fowler et al.'s book __Refactoring__. 
* [Video-Rental Refactoring Webinar Part1](https://www.youtube.com/watch?v=wUqBkzmjGpo&t=2935s)
* [Video-Rental Refactoring Webinar Part2](https://www.youtube.com/watch?v=kdIpqpGccME)

