# language: ru

Функционал: Типы оплаты

  Сценарий: Проверка вакансии тестировщика
    Когда Переходим к меню 'Careers' и подменю 'Vacancies'
    И Выбираем вакансию 'TEST AUTOMATION ENGINEER'
    Тогда Количество умений в блоке 'Professional skills and qualification:' должно быть 5
