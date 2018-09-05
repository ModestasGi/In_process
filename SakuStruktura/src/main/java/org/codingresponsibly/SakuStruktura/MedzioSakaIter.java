package org.codingresponsibly.SakuStruktura;

import java.util.Iterator;

public class MedzioSakaIter<T> implements Iterator<Saka<T>> {

    enum ProcessStages {
        ProcessParent, ProcessChildCurNode, ProcessChildSubNode
    }

    private Saka<T> saka;

    MedzioSakaIter(Saka<T> saka) {
        this.saka = saka;
        this.doNext = ProcessStages.ProcessParent;
        this.childrenCurNodeIter = saka.sakele.iterator();
    }

    private ProcessStages doNext;
    private Saka<T> next;
    private Iterator<Saka<T>> childrenCurNodeIter;
    private Iterator<Saka<T>> childrenSubNodeIter;

    @Override
    public boolean hasNext() {

        if (this.doNext == ProcessStages.ProcessParent) {
            this.next = this.saka;
            this.doNext = ProcessStages.ProcessChildCurNode;
            return true;
        }

        if (this.doNext == ProcessStages.ProcessChildCurNode) {
            if (childrenCurNodeIter.hasNext()) {
                Saka<T> childDirect = childrenCurNodeIter.next();
                childrenSubNodeIter = childDirect.iterator();
                this.doNext = ProcessStages.ProcessChildSubNode;
                return hasNext();
            }

            else {
                this.doNext = null;
                return false;
            }
        }

        if (this.doNext == ProcessStages.ProcessChildSubNode) {
            if (childrenSubNodeIter.hasNext()) {
                this.next = childrenSubNodeIter.next();
                return true;
            }
            else {
                this.next = null;
                this.doNext = ProcessStages.ProcessChildCurNode;
                return hasNext();
            }
        }

        return false;
    }

    @Override
    public Saka<T> next() {
        return this.next;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}