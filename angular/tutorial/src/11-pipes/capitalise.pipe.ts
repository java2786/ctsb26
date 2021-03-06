import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'capitalise'
})
export class CapitalisePipe implements PipeTransform {

  transform(input: string): string {
    return input.charAt(0).toUpperCase()+input.substring(1).toLowerCase()
  }

}
