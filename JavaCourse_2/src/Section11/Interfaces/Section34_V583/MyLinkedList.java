package Section11.Interfaces.Section34_V583;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            // The list was empty, so this item becomes the root
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at the end of list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());

                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        System.out.println("MyLinkedList.addItem() got to the last return. BAD!!!");
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (this.root == null) {
            System.out.println("Nothing to remove");
            return false;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                    currentItem = this.root;
                } else if (currentItem.next() == null) {
                    currentItem = currentItem.previous();
                    currentItem.setNext(null);
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                    return true;
                }
            } else {
                currentItem = currentItem.next();
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        System.out.println("Start of list");
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
        System.out.println("End of list");
    }


    public void traverse() {

        if (this.root == null) {
            System.out.println("List is empty");
            return;
        }

        ListItem currentItem = this.root;
        System.out.println("Start of list");
        while (currentItem != null) {
            System.out.println(currentItem.getValue());
            currentItem = currentItem.next();
        }
        System.out.println("End of list");
    }

    public void replace(ListItem oldItem, ListItem newItem) {
        if (this.root == null) {
            System.out.println("List is empty, nothing to replace");
            return;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(oldItem);
            if (comparison == 0) {
                if (currentItem.previous() == null) {
                    currentItem.next().setPrevious(newItem);
                    newItem.setNext(currentItem.next());
                } else if (currentItem.next() == null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                } else {
                    currentItem.previous().setNext(newItem);
                    currentItem.next().setPrevious(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem.next());
                }
                return;
            } else {
                currentItem = currentItem.next();
            }
        }
    }

//    public void replaceAll(ListItem newItem) {
//        ListItem currentItem = this.root;
//        do {
//            System.out.println("0->"+currentItem.getValue() + " " + newItem.getValue());
//            if (currentItem.previous() == null) {
//                this.root = newItem;
//                currentItem.next().setPrevious(this.root);
//                this.root.setNext(currentItem.next());
//                currentItem = currentItem.next();
//            } else if (currentItem.next() == null) {
//                currentItem.previous().setNext(newItem);
//                currentItem = newItem;
//                currentItem.setPrevious(newItem);
//            } else {
//                currentItem.next().setPrevious(newItem);
//                currentItem = currentItem.next();
//            }
//            currentItem = currentItem.next();
//        } while(currentItem.next() != null);
//
//    }

}
