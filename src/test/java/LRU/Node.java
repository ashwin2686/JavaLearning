package LRU;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Node {
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }


}

class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private Node head;
    private Node tail;

    LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.next= head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            update(node);
            return node.value;


        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            update(node);
            return;
        }

        Node node = new Node(key, value);

        if (cache.size() == capacity) {
            Node toDelete = tail.prev;
            cache.remove(toDelete.key);
            removeNode(toDelete);
        }

        cache.put(key, node);
        addFirst(node);
    }

    private void update(Node node) {
        removeNode(node);
        addFirst(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addFirst(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
}

class LRUCacheExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int capacity = keyboard.nextInt();
        LRUCache cache = new LRUCache(capacity);

        while (true) {
            String[] commandLine = keyboard.nextLine().trim().split("\\s");
            String command = commandLine[0];
            if (command.isEmpty()) {
                continue;
            }
            switch (command) {
                case "get": {
                    int num = Integer.parseInt(commandLine[1]);
                    System.out.println(cache.get(num));
                    break;
                }
                case "put": {
                    int key = Integer.parseInt(commandLine[1]);
                    int value = Integer.parseInt(commandLine[2]);
                    cache.put(key, value);
                    break;
                }
                case "exit": {
                    return;
                }
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
