def pars_str(my_str: str) -> list:
    my_list = []
    temp = 0
    for idx, elem in enumerate(my_str):
        if elem in '+-/*':
            my_list.append(float(my_str[temp:idx]))
            my_list.append(elem)
            temp = idx + 1
    my_list.append(float(my_str[temp:]))
    return my_list


def run(my_list: list):
    tmp_list = my_list.copy()
    idx = 0
    while idx < len(tmp_list):
        elem = tmp_list[idx]
        if elem == '*':
            tmp_list[idx - 1] *= tmp_list[idx + 1]
            tmp_list.pop(idx)
            tmp_list.pop(idx)
            idx -= 1
        elif elem == '/':
            tmp_list[idx - 1] /= tmp_list[idx + 1]
            tmp_list.pop(idx)
            tmp_list.pop(idx)
            idx -= 1
        idx += 1
    idx = 0
    while idx < len(tmp_list):
        elem = elem = tmp_list[idx]
        if elem == '+':
            tmp_list[idx - 1] += tmp_list[idx + 1]
            tmp_list.pop(idx)
            tmp_list.pop(idx)
            idx -= 1
        elif elem == '-':
            tmp_list[idx - 1] -= tmp_list[idx + 1]
            tmp_list.pop(idx)
            tmp_list.pop(idx)
            idx -= 1
        idx += 1
    return tmp_list[0]
