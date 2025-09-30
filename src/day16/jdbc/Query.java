package day16.jdbc;

public interface Query {
    // Why are interfaces useful?
    // 1. Generalization: Multiple classes can share the same contract, regardless of implementation details.
    // 2. Polymorphism: Enables handling different classes uniformly through the interface type.
    // 3. Scalability: Changing implementations won’t break existing code as long as the interface stays consistent.
String selectQuery();
}
