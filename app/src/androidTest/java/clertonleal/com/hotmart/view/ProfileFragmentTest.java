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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static clertonleal.com.hotmart.espresso.EspressoUtils.childAtPosition;
import static clertonleal.com.hotmart.espresso.EspressoUtils.matchToolbarTitle;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;

@RunWith(AndroidJUnit4.class)
public class ProfileFragmentTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void profileFragmentTest() {
        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Abrir navigation drawer"),
                        withParent(withId(R.id.toolbar)),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        onView(withId(R.id.list)).perform(actionOnItemAtPosition(5, click()));

        ViewInteraction textView = onView(
                allOf(withId(R.id.balance), withText("Seu saldo atual é de:"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Seu saldo atual é de:")));

        ViewInteraction textView2 = onView(
                allOf(withText("R$2.152,23"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("R$2.152,23")));

        ViewInteraction textView3 = onView(
                allOf(withText("Mensagens recentes"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        textView3.check(matches(withText("Mensagens recentes")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.menu_counter), withText("+10"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView4.check(matches(withText("+10")));

        ViewInteraction imageView2 = onView(
                allOf(withId(R.id.profileImage), withTagValue(equalTo("0")),
                        childAtPosition(
                                allOf(withId(R.id.circle_container),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                                0)),
                                0),
                        isDisplayed()));
        imageView2.check(matches(isDisplayed()));

        ViewInteraction textView5 = onView(
                allOf(withText("Clerton Leal"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.support.v7.widget.RecyclerView.class),
                                        0),
                                1),
                        isDisplayed()));
        textView5.check(matches(withText("Clerton Leal")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.text_initial), withText("V"), withTagValue(equalTo("1")),
                        childAtPosition(
                                allOf(withId(R.id.circle_container),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        textView6.check(matches(withText("V")));

        ViewInteraction textView7 = onView(
                allOf(withText("Valeria Siqueira"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.support.v7.widget.RecyclerView.class),
                                        1),
                                1),
                        isDisplayed()));
        textView7.check(matches(withText("Valeria Siqueira")));

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.title), withText("Como Decorar uma festa infantal maravilhosa e simples de fazer"), withTagValue(equalTo("0")),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container),
                                        0),
                                0),
                        isDisplayed()));
        textView8.check(matches(withText("Como Decorar uma festa infantal maravilhosa e simples de fazer")));

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.id), withText("id 30294080"), withTagValue(equalTo("0")),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                        1),
                                0),
                        isDisplayed()));
        textView9.check(matches(withText("id 30294080")));

        ViewInteraction textView10 = onView(
                allOf(withId(R.id.date), withText("12/12/2016"), withTagValue(equalTo("0")),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                        1),
                                2),
                        isDisplayed()));
        textView10.check(matches(withText("12/12/2016")));

        ViewInteraction textView11 = onView(
                allOf(withId(R.id.value), withText("R$1.035,00"), withTagValue(equalTo("0")),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container),
                                        1),
                                1),
                        isDisplayed()));
        textView11.check(matches(withText("R$1.035,00")));

        matchToolbarTitle("Minha Conta");
    }

}
