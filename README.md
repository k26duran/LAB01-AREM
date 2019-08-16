# LABORATORY 1-AREM

In this laboratory we have to implement a linked list, and calculate the mean and standard desviation based on the data of the linked list.

## Prerequisites

It is necessary to have installed java 1.8 and Apache Maven 3.6.0.

## Design

The first thing to do is to create the LinkedList class in which we will store the data provided to us. The linked list class was implemented with a node class, which will be formed by a double type variable and another node that will indicate which is the next node.
We create the necessary methods to solve the exercise, for example to insert a new node in the list, for this we are going to create the new node with the data that they give us, if the list is empty then that new node will become the head of the list, but then we go towards the last node of the list and we place the new node.
The insertion in the list is done at the end, that is, the new node is added after the last node of the linked list. Since a linked list is usually represented by its main pointer, then it is necessary to go through the list up to the last node and then change the next one from the last node to the new node.
To calculate the mean and standard desviation of the linked list, we were used the followinf formulas:

![](https://github.com/k26duran/LAB01-AREM/blob/master/img/formulas.PNG)

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

## License

This project is under the Apache license - see [LICENSE](LICENSE.md) for more details.

## Author

[Karen Duran](https://github.com/k26duran) - Escuela Colombiana de Ingenieria Julio Garavito.