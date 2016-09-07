package com.softartdev.ticketscinema.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softartdev.ticketscinema.R;
import com.softartdev.ticketscinema.model.MovieItem;

import java.util.ArrayList;

public class AfishaFragment extends RecyclerFragmentAdapter {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        RecyclerView mItemRecyclerView = (RecyclerView) view.findViewById(R.id.item_recycler_view);
        mItemRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<MovieItem> movieList = getMoviesList();
        CustomRecyclerAdapter adapter = new CustomRecyclerAdapter(movieList);
        mItemRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

    ArrayList<MovieItem> getMoviesList(){
        ArrayList<MovieItem> results = new ArrayList<MovieItem>();

        MovieItem movieItem = new MovieItem();
        movieItem.setName("Джейсон Борн");
        movieItem.setTag("16+ 2D");
        movieItem.setGenre("боевик, триллер");
        movieItem.setMiniDescription("Мир на грани катастрофы, а значит пришло время ему вернуться. Неаполь, Мюнхен, Нью-Йорк – его имя знают повсюду. Элитный суперагент, лучший из лучших, даже в Лас-Вегасе игра пойдет по его правилам. Он – Джейсон Борн.");
        movieItem.setFrom("2 час 3 минут");
        movieItem.setImageNumber(R.drawable.afisha_1);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("Всё о мужчинах");
        movieItem.setTag("18+ 2D");
        movieItem.setGenre("комедия");
        movieItem.setMiniDescription("Это история о том, какими разными могут быть мужчины. О том, что мужчины — это, в первую очередь, сложные решения и настоящие поступки. О том, в чем мужчины могут быть сильны, а в чем комичны. О том, за что их можно и нужно любить…");
        movieItem.setFrom("1 час 18 минут");
        movieItem.setImageNumber(R.drawable.afisha_2);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("Очень плохие мамочки");
        movieItem.setTag("18+ 2D | ATMOS");
        movieItem.setGenre("комедия");
        movieItem.setMiniDescription("Идеальная мать, прекрасная жена, хорошая домохозяйка с успешной карьерой… Но стоит немного расслабиться, как тебе сразу напоминают о твоих обязанностях. Почему только мужчины имеют право развлекаться? Сколько же можно это терпеть?! Пора команде отчаянных мамочек пустится во все тяжкие.");
        movieItem.setFrom("1 час 41 минут");
        movieItem.setImageNumber(R.drawable.afisha_3);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("Девять жизней");
        movieItem.setTag("6+ 2D");
        movieItem.setGenre("комедия");
        movieItem.setMiniDescription("Том Бренд (Кевин Спейси) – миллиардер-трудоголик с чудинкой. Он с головой погружен в работу и немного выпал из семейной жизни — даже подарок дочери он покупает в последний момент. Ребекка мечтает о настоящем коте, и как бы Том ни презирал животных, он отправляется в зоомагазин, где выбирает самого роскошного кота по кличке Мистер Пушистые Штаны. В спешке на праздник дочери Том попадает в аварию, а очнувшись, обнаруживает себя в теле этого самого кота. Пока Том-человек отсыпается в больнице, Том-Пушистые Штаны вынужден на собственной шкуре испытать все прелести кошачьей жизни и вернуть любовь семьи, чтобы не остаться навсегда в роли питомца. Благо, жена (Дженифер Гарнер) и дочь принимают кота как родного. Но как заставить их разглядеть в Мистере Пушистые Штаны раскаявшегося отца семейства?");
        movieItem.setFrom("1 час 27 минут");
        movieItem.setImageNumber(R.drawable.afisha_4);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("Девятая жизнь Луи Дракса");
        movieItem.setTag("18+ 2D");
        movieItem.setGenre("триллер");
        movieItem.setMiniDescription("Знаменитый психолог Аллан Паскаль пытается раскрыть тайны, которые хранит сознание 9-летнего Луи Дракса, впавшего в кому после таинственного несчастного случая. Влюбленный в мать мальчика доктор подозревает в случившемся отца. Но чем глубже он погружается в подсознание ребенка, тем сильнее размываются границы между мистикой и реальностью…");
        movieItem.setFrom("1 час 49 минут");
        movieItem.setImageNumber(R.drawable.afisha_5);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("Не дыши");
        movieItem.setTag("16+ 2D");
        movieItem.setGenre("ужасы, триллер");
        movieItem.setMiniDescription("Грабители забираются в дом одинокого слепого старика с целью украсть огромную сумму, которая, по слухам, спрятана где-то внутри. Казалось бы – что может быть проще, чем вынести деньги из дома практического беспомощного человека. Но они жестоко ошибаются: преследуемый становится преследователем. И тайна, которую он хранит, гораздо страшнее, чем обычные пенсионные накопления.");
        movieItem.setFrom("1 час 28 минут");
        movieItem.setImageNumber(R.drawable.afisha_6);
        results.add(movieItem);

        return results;
    }
}
