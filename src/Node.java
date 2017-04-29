///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Thisura Sagara
// */
//
//public class Node {
//    
//    private int i ;
//    private int j;
//    private boolean blocked;
//    private int gcost;
//    private int hcost ;
//    private Node parent;
//
//    public Node() {
//    }
//
//    public Node(int i, int j, boolean blocked, int gcost, int hcost, Node parent) {
//        this.i = i;
//        this.j = j;
//        this.blocked = blocked;
//        this.gcost = gcost;
//        this.hcost = hcost;
//        this.parent = parent;
//    }
//    
//    
//    public int getFCost(){
//        return getHcost()+getGcost();
//    }
//
//    /**
//     * @return the i
//     */
//    public int getI() {
//        return i;
//    }
//
//    /**
//     * @param i the i to set
//     */
//    public void setI(int i) {
//        this.i = i;
//    }
//
//    /**
//     * @return the j
//     */
//    public int getJ() {
//        return j;
//    }
//
//    /**
//     * @param j the j to set
//     */
//    public void setJ(int j) {
//        this.j = j;
//    }
//
//    /**
//     * @return the blocked
//     */
//    public boolean isBlocked() {
//        return blocked;
//    }
//
//    /**
//     * @param blocked the blocked to set
//     */
//    public void setBlocked(boolean blocked) {
//        this.blocked = blocked;
//    }
//
//    /**
//     * @return the gcost
//     */
//    public int getGcost() {
//        return gcost;
//    }
//
//    /**
//     * @param gcost the gcost to set
//     */
//    public void setGcost(int gcost) {
//        this.gcost = gcost;
//    }
//
//    /**
//     * @return the hcost
//     */
//    public int getHcost() {
//        return hcost;
//    }
//
//    /**
//     * @param hcost the hcost to set
//     */
//    public void setHcost(int hcost) {
//        this.hcost = hcost;
//    }
//
//    /**
//     * @return the parent
//     */
//    public Node getParent() {
//        return parent;
//    }
//
//    /**
//     * @param parent the parent to set
//     */
//    public void setParent(Node parent) {
//        this.parent = parent;
//    }
//    
//}
