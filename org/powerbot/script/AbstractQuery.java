package org.powerbot.script;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;









public abstract class AbstractQuery<T extends AbstractQuery<T, K, C>, K, C extends ClientContext>
  extends ClientAccessor<C>
  implements Iterable<K>, Nillable<K>
{
  private final ThreadLocal<List<K>> items;
  
  public AbstractQuery(C arg0)
  {
    super(arg0);
    
    items = new ThreadLocal()
    {
      protected List<K> initialValue() {
        return new CopyOnWriteArrayList(get());
      }
    };
  }
  





  protected abstract T getThis();
  





  protected abstract List<K> get();
  




  public final Stream<K> stream()
  {
    Stream.Builder localBuilder = Stream.builder();
    for (Object localObject : (List)items.get()) {
      localBuilder.accept(localObject);
    }
    return localBuilder.build();
  }
  




  public T select()
  {
    List localList1 = (List)items.get();List localList2 = get();
    setArray(localList1, localList2);
    return getThis();
  }
  






  public T select(Iterable<K> arg0)
  {
    List localList = (List)items.get();ArrayList localArrayList = new ArrayList();
    for (Object localObject : arg0) {
      localArrayList.add(localObject);
    }
    setArray(localList, localArrayList);
    return getThis();
  }
  






  public T select(Filter<? super K> arg0)
  {
    List localList = (List)items.get();ArrayList localArrayList = new ArrayList(localList.size());
    for (Object localObject : localList) {
      if (arg0.accept(localObject)) {
        localArrayList.add(localObject);
      }
    }
    setArray(localList, localArrayList);
    return getThis();
  }
  





  public T sort(Comparator<? super K> arg0)
  {
    List localList = (List)items.get();ArrayList localArrayList = new ArrayList(localList);
    Collections.sort(localArrayList, arg0);
    setArray(localList, localArrayList);
    return getThis();
  }
  




  public T shuffle()
  {
    List localList = (List)items.get();ArrayList localArrayList = new ArrayList(localList);
    Collections.shuffle(localArrayList);
    setArray(localList, localArrayList);
    return getThis();
  }
  




  public T reverse()
  {
    List localList = (List)items.get();ArrayList localArrayList = new ArrayList(localList);
    Collections.reverse(localArrayList);
    setArray(localList, localArrayList);
    return getThis();
  }
  
  private void setArray(List<K> arg0, List<K> arg1) {
    arg0.clear();
    arg0.addAll(arg1);
  }
  





  public T limit(int arg0)
  {
    return limit(0, arg0);
  }
  






  public T limit(int arg0, int arg1)
  {
    List localList = (List)items.get();ArrayList localArrayList = new ArrayList(arg1);
    int i = Math.min(arg0 + arg1, localList.size());
    for (int j = arg0; j < i; j++) {
      localArrayList.add(localList.get(j));
    }
    setArray(localList, localArrayList);
    return getThis();
  }
  




  public T first()
  {
    return limit(1);
  }
  





  public T addTo(Collection<? super K> arg0)
  {
    arg0.addAll((Collection)items.get());
    return getThis();
  }
  



  public Iterator<K> iterator()
  {
    final Iterator localIterator = ((List)items.get()).iterator();
    
    new Iterator()
    {
      public boolean hasNext() {
        return localIterator.hasNext();
      }
      
      public K next()
      {
        return hasNext() ? localIterator.next() : nil();
      }
      
      public void remove()
      {
        localIterator.remove();
      }
    };
  }
  




  public K poll()
  {
    List localList = (List)items.get();
    if (localList.isEmpty()) {
      return nil();
    }
    Object localObject = localList.get(0);
    limit(1, localList.size() - 1);
    return localObject;
  }
  




  public K peek()
  {
    List localList = (List)items.get();
    return localList.isEmpty() ? nil() : localList.get(0);
  }
  





  public T each(Filter<? super K> arg0)
  {
    for (Object localObject : this) {
      if (!arg0.accept(localObject)) {
        break;
      }
    }
    
    return getThis();
  }
  




  public boolean isEmpty()
  {
    return ((List)items.get()).isEmpty();
  }
  





  public boolean contains(K arg0)
  {
    return ((List)items.get()).contains(arg0);
  }
  




  public int size()
  {
    return ((List)items.get()).size();
  }
}
