package dsa.Problems.practice;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class Tech {

    int i;
    int j;
    public Tech(int i, int j){
        this.i=i;
        this.j=j;
    }
}
public class ReferenceTypes {

    public static void main(String[] args) {

        Tech tech = new Tech(10,20); // By default reference type/class is Strong Reference.



        WeakReference<Tech> weakRef = new WeakReference<>(tech); // With weak reference, the object will be G collected when JVM needs memory
// M    // Making the tech reference available for GC.
        //tech = null;
        System.out.println(weakRef.get().i);

        SoftReference<Tech> softRef = new SoftReference<>(tech);
        System.out.println(softRef.get().j);

        ReferenceQueue<Tech> referenceQueue = new ReferenceQueue<>();

        PhantomReference<Tech> phantomReference = new PhantomReference<>(tech, referenceQueue);
        //System.out.println(phantomReference.get().i);
        System.out.println(referenceQueue.toString());
    }
}
