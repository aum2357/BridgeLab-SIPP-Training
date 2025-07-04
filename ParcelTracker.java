package com.ganesha;

public class ParcelTracker {
    static Order head = null;
    static Order tail = null;

    public static void addAtEnd(Packed pStatus, Shipped sStatus, InTransit iStatus, Delivered dStatus) {
        Order status = new Order(pStatus, sStatus, iStatus, dStatus);
        if (head == null) {
            head = tail = status;
        } else {
            tail.next = status;
            tail = status;
        }
    }

    public static void displayStatus() {
        Order temp = head;
        while (temp != null) {
            if (temp.packed.isPacked) {
                System.out.print("Packed -> ");
            } else {
                System.out.print("Under Packing Process ");
                return;
            }
            if (temp.shipped.isShipped) {
                System.out.print("Shipped -> ");
            } else {
                System.out.println("Under Shipping Process");
                return;
            }
            if (temp.inTransit.isInTransit) {
                System.out.print("InTransit -> ");
            } else {
                System.out.println("Under Transiting Process");
                return;
            }
            if (temp.delivered.isDelivered) {
                System.out.print("Delivered ->");
            } else {
                System.out.println("Under Delivering Process");
                return;
            }
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        addAtEnd(new Packed(true), new Shipped(true), new InTransit(false), new Delivered(false));


        displayStatus();
    }


    static class Order {
        Packed packed;
        Shipped shipped;
        InTransit inTransit;
        Delivered delivered;
        Order next;

        public Order(Packed packed, Shipped shipped, InTransit inTransit, Delivered delivered) {
            this.packed = new Packed(packed.isPacked);
            this.shipped = new Shipped(shipped.isShipped);
            this.inTransit = new InTransit(inTransit.isInTransit);
            this.delivered = new Delivered(delivered.isDelivered);
        }
    }

    static class Packed {
        boolean isPacked;
        Packed next;

        public Packed(boolean isPacked) {
            this.isPacked = isPacked;
            next = null;
        }
    }

    static class Shipped {
        boolean isShipped;
        Shipped next;

        public Shipped(boolean isShipped) {
            this.isShipped = isShipped;
            next = null;
        }
    }

    static class InTransit {
        boolean isInTransit;
        InTransit next;

        public InTransit(boolean isInTransit) {
            this.isInTransit = isInTransit;
            next = null;
        }
    }

    static class Delivered {
        boolean isDelivered;
        Delivered next;

        public Delivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            next = null;
        }
    }
}