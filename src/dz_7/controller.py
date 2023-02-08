import view
import model


def calculat():
    str_expression = view.in_expression()
    list_expression = model.pars_str(str_expression)
    result = model.run(list_expression)
    view.result(str_expression, result)
