package com.dgmf.entity;

// This is a simple Java class that represents a
// "Hello World" message.
public class HelloWorldBean {
    // The message field stores the "Hello World" message.
    private String message;

    // The constructor initializes the message field with
    // the provided value.
    public HelloWorldBean(String message) {
        this.message = message;
    }

    // Getter method for the message field.
    public String getMessage() {
        // The getMessage() method returns the value of
        // the message field.
        return message;
    }

    // Setter method for the message field.
    public void setMessage(String message) {
        // The setMessage() method sets the value of
        // the message field.
        this.message = message;
    }

    // The toString() method returns a string representation of
    // the HelloWorldBean object.
    @Override
    public String toString() {
        // The toString() method is overridden to provide a custom
        // string representation of the HelloWorldBean object.
        return "HelloWorldBean [message=" + message + "]";
    }
}
