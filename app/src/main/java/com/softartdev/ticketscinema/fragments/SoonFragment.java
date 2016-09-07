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

public class SoonFragment extends RecyclerFragmentAdapter {
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
        movieItem.setName("ОХОТНИКИ ЗА ПРИВИДЕНИЯМИ");
        movieItem.setTag("16+ 2D");
        movieItem.setGenre("фантастическая комедия");
        movieItem.setMiniDescription("Перезапуск легендарной кинофраншизы. В центре новой истории – команда бесстрашных девушек, которые встали на защиту Нью-Йорка, наводненного целой армией привидений.");
        movieItem.setFrom("с 28 июля");
        movieItem.setImageNumber(R.drawable.soon_1);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("НЕВЕРОЯТНЫЙ БЛИНКИ БИЛЛ");
        movieItem.setTag("6+ 2D | 3D");
        movieItem.setGenre("анимация, комедия");
        movieItem.setMiniDescription("Невероятные и захватывающие похождения медвежонка-коалы в диких джунглях.");
        movieItem.setFrom("с 28 июля");
        movieItem.setImageNumber(R.drawable.soon_2);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("ПЕЛЕ: РОЖДЕНИЕ ЛЕГЕНДЫ");
        movieItem.setTag("12+ 2D | 3D | ATMOS");
        movieItem.setGenre("драма, биография, спорт");
        movieItem.setMiniDescription("Биографическая драма расскажет о закулисье спорта, в частности о жизни величайшего игрока в истории футбола — Пеле. Зрители станут свидетелями непростой жизни бразильской легенды спорта. Сколько преград тому удалось преодолеть на своем пути, чтобы добиться мировой популярности? Это сейчас он демонстрирует невероятные профессиональные достижения и вдобавок ко всему не забывает о благородных делах, но раньше все было по-другому. С ранних лет Пеле жаждал получить признание, неустанно шел к своей мечте, преодолевая препятствия, тем самым закаляя свой характер. Картина охватывает детство футболиста, вплоть до победы на первом этапе Кубка мира в Швеции, когда Пеле было семнадцать лет. Судьба не всегда была благосклонна к спортсмену, однако за каждой успешной личности стоит огромный труд, железная воля и твердая уверенность в собственных силах.");
        movieItem.setFrom("с 28 июля");
        movieItem.setImageNumber(R.drawable.soon_3);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("ОТРЯД САМОУБИЙЦ");
        movieItem.setTag("16+ 2D | 3D");
        movieItem.setGenre("боевик");
        movieItem.setMiniDescription("Как же хорошо быть плохим... Собрать команду из самых опасных из сидящих за решеткой суперзлодеев, снабдить их самым мощным оружием из государственного арсенала и отправить на задание по уничтожению загадочного, непобедимого существа. Офицер американской разведки Аманда Уоллер допускает к этой миссии только одну секретно набранную группу, состоящую из отчаянных злобных антигероев, которым практически нечего терять. Но когда те поймут, что были выбраны не для успешного исполнения задания, а чтобы было на кого свалить провал, который неизбежно случится, решит ли Отряд самоубийц пойти до конца, пытаясь завершить миссию, или каждый будет сам за себя?");
        movieItem.setFrom("с 04 августа");
        movieItem.setImageNumber(R.drawable.soon_4);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("ПИТ И ЕГО ДРАКОН");
        movieItem.setTag("6+ 2D | 3D");
        movieItem.setGenre("фэнтези,приключения");
        movieItem.setMiniDescription("В течение многих лет Мистер Мичем забавлял местных детишек сказочными историями о свирепом драконе, обитающим на севере, глубоко в лесах. Для его дочери Грейс все эти истории казались ничем иным как выдумкой, ровно до тех пор, пока она не встретила в лесу маленького мальчика по имени Пит. Пит уже долгое время живет в диком лесу, у него нет ни дома, ни семьи, зато есть замечательный друг – огромный зеленый дракон Эллиот. Грейс решает разгадать историю юного Пита, узнать всю правду о его семье и загадочном драконе, о котором ходит так много слухов и легенд. Новое приключение Disney на основе одной из самых захватывающих и добрых историй про настоящую дружбу мальчика и его верного дракона.");
        movieItem.setFrom("с 11 августа");
        movieItem.setImageNumber(R.drawable.soon_5);
        results.add(movieItem);

        movieItem = new MovieItem();
        movieItem.setName("ТАЙНАЯ ЖИЗНЬ ДОМАШНИХ ЖИВОТНЫХ");
        movieItem.setTag("6+ 2D");
        movieItem.setGenre("анимационная комедия");
        movieItem.setMiniDescription("Что делают домашние животные, пока хозяева пропадают на работе? С тоской смотрят в окно? Смиренно дремлют на коврике у двери? Как бы не так. Они ведут свою тайную жизнь.");
        movieItem.setFrom("с 18 августа");
        movieItem.setImageNumber(R.drawable.soon_6);
        results.add(movieItem);

        return results;
    }

}
