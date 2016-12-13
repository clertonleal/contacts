package clertonleal.com.hotmart.view;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.view.activity.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static clertonleal.com.hotmart.espresso.EspressoUtils.childAtPosition;
import static clertonleal.com.hotmart.espresso.EspressoUtils.matchToolbarTitle;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;

@RunWith(AndroidJUnit4.class)
public class MessagesActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void messagesActivityTest() {
        ViewInteraction textView = onView(
                allOf(withId(R.id.menu_counter), withText("+10"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("+10")));

        ViewInteraction textView2 = onView(
                allOf(withText("Clerton Leal"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.grid_messages),
                                        0),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("Clerton Leal")));

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.text_initial), withText("V"), withTagValue(equalTo("1")),
                        childAtPosition(
                                allOf(withId(R.id.circle_container),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        textView3.check(matches(withText("V")));

        ViewInteraction textView4 = onView(
                allOf(withText("Valeria Siqueira"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.grid_messages),
                                        1),
                                1),
                        isDisplayed()));
        textView4.check(matches(withText("Valeria Siqueira")));

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.text_initial), withText("M"), withTagValue(equalTo("2")),
                        childAtPosition(
                                allOf(withId(R.id.circle_container),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        textView5.check(matches(withText("M")));

        ViewInteraction textView6 = onView(
                allOf(withText("Maria Carol"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.grid_messages),
                                        2),
                                1),
                        isDisplayed()));
        textView6.check(matches(withText("Maria Carol")));

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.text_initial), withText("F"), withTagValue(equalTo("3")),
                        childAtPosition(
                                allOf(withId(R.id.circle_container),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        textView7.check(matches(withText("F")));

        ViewInteraction textView8 = onView(
                allOf(withText("Flavia de Alcantara"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.grid_messages),
                                        3),
                                1),
                        isDisplayed()));
        textView8.check(matches(withText("Flavia de Alcantara")));

        matchToolbarTitle("Mensagens");
    }
}
