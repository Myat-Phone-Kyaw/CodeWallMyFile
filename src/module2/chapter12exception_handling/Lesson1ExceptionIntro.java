package module2.chapter12exception_handling;

public class Lesson1ExceptionIntro {
}


/**
 * Exception in Java
 *
 * Exception Handling in Java is one of the effective means
 * to handle the runtime errors so that the regular flow of
 * the application can be preserved. Java Exception Handling
 * is a mechanism to handle runtime errors such as ClassNotFoundException,
 * IOException, SQLException, RemoteException, etc.
 *
 *
 * Exception is an unwanted or unexpected event,
 *which occurs during the execution of a program
 *  i.e at run time, that disrupts the normal flow
 *  of the program’s instructions.
 *  Exceptions can be caught and handled by the program.
 *  When an exception occurs within a method, it creates an object.
 *  This object is called the exception object.
 *  It contains information about the exception
 *  such as the name and description of the exception
 *  and the state of the program when the exception occurred.
 *
 *  Major reasons why an exception Occurs
 *
 * Invalid user input
 * Device failure
 * Loss of network connection
 * Physical limitations (out of disk memory)
 * Code errors
 * Opening an unavailable file
 *
 * Errors represent irrecoverable conditions such as
 * Java virtual machine (JVM) running out of memory,
 * memory leaks, stack overflow errors, library incompatibility,
 * infinite recursion, etc. Errors are usually beyond the control of the programmer
 * and we should not try to handle errors.
 */