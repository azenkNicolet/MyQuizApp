package com.zenk.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>
    {
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
        R.drawable.ic_flag_of_argentina,
        "Argentina", "Australia", "Armenia", "Austria",
        1)

        val que2 = Question(2, "What country does this flag belong to?",
        R.drawable.ic_flag_of_fiji, "Colombia", "Mexico", "Argentina",
        "Fiji", 4 )

        val que3 = Question(3, "What country does this flag belong to?",
        R.drawable.ic_flag_of_australia, "New Zealand", "Australia", "England",
            "France", 2)

        val que4 = Question(4, "What country does this flag belong to?",
        R.drawable.ic_flag_of_belgium, "Germany", "Russia", "Belgium",
        "Norway", 3)

        val que5 = Question(5, "What country does this flag belong to?",
        R.drawable.ic_flag_of_germany, "Germany", "Belgium", "Sweden",
        "Ireland", 1)

        val que6 = Question(6, "What country does this flag belong to?",
        R.drawable.ic_flag_of_brazil, "Mexico", "Brazil", "Chile",
        "Latvia", 2)

        val que7 = Question(7, "What country does this flag belong to?",
        R.drawable.ic_flag_of_denmark, "Germany", "Finland", "Denmark",
        "Norway", 3)

        val que8 = Question(8, "What country does this flag belong to?",
        R.drawable.ic_flag_of_india, "India", "Iraq", "Iran",
        "Kuwait", 1)

        val que9 = Question(9, "What country does this flag belong to?",
        R.drawable.ic_flag_of_kuwait, "Kuwait", "Iraq", "Pakistan",
        "Iran", 1)

        val que10 = Question(10, "What country does this flag belong to?",
        R.drawable.ic_flag_of_new_zealand, "Australia", "Austria", "England",
        "New Zealand", 4)

        //Add questions to questionsList
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}