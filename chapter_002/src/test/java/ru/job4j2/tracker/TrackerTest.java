package ru.job4j2.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Nikolai Basharin(nick712@yandex.ru)
 * @version $Id$
 * @since 0.1
 */


public class TrackerTest {

    /**
     * Test add(Item item)
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * Test replace(String id, Item item)
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Test delete(String id)
     */

    @Test
    public void whenDeleteOneItemOfThree() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("t1", "testDel1", 123L));
        Item deletedItem = new Item("t2", "testDel2", 1223L);
        tracker.add(deletedItem);
        tracker.add(new Item("t3", "testDel3", 1243L));
        tracker.delete(deletedItem.getId());
        assertThat(tracker.findAll()[1].getName(), is("t3"));
    }

    /**
     * Test Item[] findAll()
     */

    @Test
    public void whenFindingAllOfFiveItems() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("t1", "testDesc1", 123L));
        tracker.add(new Item("t2", "testDesc2", 1223L));
        tracker.add(new Item("t3", "testDesc3", 1233L));
        tracker.add(new Item("t4", "testDesc4", 1243L));
        tracker.add(new Item("t5", "testDesc5", 1253L));
        assertThat(tracker.findAll().length, is(5));

    }

    /**
     * Test Item[] findByName(String key)
     */
    @Test
    public void whenFindByNameReturnMassiveWithRightItemNames() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("t1", "testDesc1", 123L));
        tracker.add(new Item("t2", "testDesc2", 1223L));
        tracker.add(new Item("t2", "testDesc3", 1233L));
        tracker.add(new Item("t3", "testDesc4", 1243L));
        tracker.add(new Item("t5", "testDesc5", 1253L));
        tracker.add(new Item("t2", "testDesc6", 1253L));
        tracker.add(new Item("t2", "testDesc7", 1253L));
        assertThat(tracker.findByName("t2").length, is(4));
    }

    /**
     * Test Item findById(String id)
     */
    @Test
    public void whenFindItemWithIdItGetItemWithItId() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("t1", "testDesc1", 123L));
        tracker.add(new Item("t2", "testDesc2", 1223L));
        tracker.add(new Item("t2", "testDesc3", 1233L));
        Item itemIdSearch = new Item("TestIdSearch", "testDesc4", 1243L);
        tracker.add(itemIdSearch);
        tracker.add(new Item("t5", "testDesc5", 1253L));
        assertThat(tracker.findById(itemIdSearch.getId()).getName(), is("TestIdSearch"));
    }

}
